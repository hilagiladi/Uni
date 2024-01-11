// FAQ Accordion
document.addEventListener('DOMContentLoaded', () => {
    const faqContainer = document.querySelector('.faq-content');

    faqContainer.addEventListener('click', (e) => {
        const groupHeader = e.target.closest('.faq-group-header');

        if (!groupHeader) return;

        const group = groupHeader.parentElement;
        const groupBody = group.querySelector('.faq-group-body');
        const icon = groupHeader.querySelector('i');

        // Toggle icon
        icon.classList.toggle('fa-plus');
        icon.classList.toggle('fa-minus');

        // Toggle visibility of body
        groupBody.classList.toggle('open');

        // Close other open FAQ bodies
        const otherGroups = faqContainer.querySelectorAll('.faq-group');

        otherGroups.forEach((otherGroup) => {
            if (otherGroup !== group) {
                const otherGroupBody = otherGroup.querySelector('.faq-group-body');
                const otherIcon = otherGroup.querySelector('.faq-group-header i');

                otherGroupBody.classList.remove('open');
                otherIcon.classList.remove('fa-minus');
                otherIcon.classList.add('fa-plus');
            }
        });
    });
});

// Mobile Menu
document.addEventListener('DOMContentLoaded', () => {
    const hamburgerButton = document.querySelector('.hamburger-button');
    const mobileMenu = document.querySelector('.mobile-menu');

    hamburgerButton.addEventListener('click', () =>
        mobileMenu.classList.toggle('active')
    );
});

// Toggle dropdown menu on click
/*document.addEventListener("DOMContentLoaded", function () {
    const dropdownToggle = document.querySelector('.navbar-link');
    const dropdownMenu = document.querySelector('.dropdown-menu');

    dropdownToggle.addEventListener('click', function () {
        dropdownMenu.style.display = (dropdownMenu.style.display === 'block') ? 'none' : 'block';
    });

    // Close dropdown menu when clicking outside
    document.addEventListener('click', function (event) {
        const isClickInside = dropdownToggle.contains(event.target) || dropdownMenu.contains(event.target);

        if (!isClickInside) {
            dropdownMenu.style.display = 'none';
        }
    });
});


// Toggle dropdown menu on hover
document.addEventListener("DOMContentLoaded", function () {
    const dropdownToggle = document.querySelector('.navbar-link');
    const dropdownMenu = document.querySelector('.dropdown-menu');

    // Show the dropdown menu on hover
    dropdownToggle.addEventListener('mouseover', function () {
        dropdownMenu.style.display = 'block';
    });

    // Hide the dropdown menu on mouseout
    dropdownToggle.addEventListener('mouseout', function () {
        dropdownMenu.style.display = 'none';
    });

    // Close dropdown menu when moving the mouse outside
    document.addEventListener('mouseover', function (event) {
        const isHoverInside = dropdownToggle.contains(event.target) || dropdownMenu.contains(event.target);

        if (!isHoverInside) {
            dropdownMenu.style.display = 'none';
        }
    });
});*/
// document.addEventListener("DOMContentLoaded", function () {
//     const navbarLink = document.querySelector('.navbar-link');
//     const dropdownMenu = document.querySelector('.dropdown-menu');
//
//     navbarLink.addEventListener('mouseover', function () {
//         dropdownMenu.style.display = 'block';
//     });
//
//     navbarLink.addEventListener('mouseout', function () {
//         dropdownMenu.style.display = 'none';
//     });
//
//     dropdownMenu.addEventListener('mouseover', function () {
//         dropdownMenu.style.display = 'block';
//     });
//
//     dropdownMenu.addEventListener('mouseout', function () {
//         dropdownMenu.style.display = 'none';
//     });
// });

document.addEventListener("DOMContentLoaded", function () {
    const button = document.getElementById('user-button');
    const buttonStyles = window.getComputedStyle(button);

    // Retrieve the width and height of the button
    const buttonWidth = buttonStyles.width;
    const buttonHeight = buttonStyles.height;

    // Set custom properties
    document.documentElement.style.setProperty('--button-width', buttonWidth);
    document.documentElement.style.setProperty('--button-height', buttonHeight);
});

// script.js
function scrollToTop() {
    // Scroll smoothly to the top of the page
    window.scrollTo({
        top: 0,
        behavior: 'smooth'
    });
}

