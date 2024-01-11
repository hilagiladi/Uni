package com.uni_web.controller;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;


@Controller

public class ContactController {


    private final JavaMailSender javaMailSender;

    @Autowired
    public ContactController(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact-form";
    }

    @PostMapping("/contact")
    public String submitContact(HttpServletRequest request,
                                @RequestParam("attachment") MultipartFile multipartFile,
                                Model model) throws MessagingException, UnsupportedEncodingException {

        // Add these lines before sending the email

        // Process the form data
        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");
        String subject = request.getParameter("subject");
        String content = request.getParameter("content");

        MimeMessage mailMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mailMessage, true, "UTF-8");

        String mailSubject = fullName + " has sent you a massage via uni-web";
        String mailContent = "<p><b>Sender Name:</b> " + fullName + "</p>";
        mailContent += "<p><b>Sender E-mail:</b> " + email + "</p>";
        mailContent += "<p><b>Subject:</b> " + subject + "</p>";
        mailContent += "<p><b>Content:</b> " + content;
        mailContent += "<hr><img src='cid:logoImage'/>";


        helper.setFrom("hilaly55@gmail.com", "Uni-Web Contact");//th address below the firm
        helper.setTo("hilaly55@gmail.com");//the address tha receiving the mail
        helper.setSubject(mailSubject);
        helper.setText(mailContent, true);

        ClassPathResource resource = new ClassPathResource("static/img/logo.png");
        helper.addInline("logoImage", resource);

        // Send the email
        if (!multipartFile.isEmpty()) {
            String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());

            InputStreamSource source = new InputStreamSource() {
                @Override
                public InputStream getInputStream() throws IOException {
                    return multipartFile.getInputStream();
                }
            };

            helper.addAttachment(fileName, source);
        }

        javaMailSender.send(mailMessage);

        // Add confirmation message to the model
        model.addAttribute("confirmationMessage", "Your message has been sent successfully!");

        // Redirect to thank-you page
        return "contact-form";
    }
    
}
