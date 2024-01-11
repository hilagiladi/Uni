//  for empty input
document.addEventListener("DOMContentLoaded", function () {
    // Get all input elements with the class 'clear-on-load'
    const inputs = document.getElementsByClassName("clear-on-load");

    // Iterate through the input elements and set their values to an empty string
    for (let i = 0; i < inputs.length; i++) {
        inputs[i].value = "";
    }
});