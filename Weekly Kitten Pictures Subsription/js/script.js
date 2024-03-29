/**
student name: Na Yang
Student Number: 040744984 
**/

//validate email 
//Retrieves the DOM element with the ID "email"
let emailInput = document.getElementById("email");
let emailError = document.getElementById("emailError");
//Adds an event listener to the email input field, when the field loses focus on blur event call the trigger validateEmail function.
emailInput.addEventListener("blur", validateEmail);
function validateEmail(){
    //Retrieves the value entered into the email input field.
    let email = emailInput.value;
    //Defines a regular expression pattern to validate the email address format.
    let emailRegular = /^\S+@\S+\.\S+$/;
    //Checks if the entered email address matches the defined regular expression pattern.
    if(! emailRegular.test(email)){
        //display an error message indicating the correct email format
        emailError.textContent = "\u2718 Email address should be non-empty with the format xyx@xyz.xyz"
        //Adds the "error-input" class to the emailInput element to visually indicate the error.
        emailInput.classList.add("error-input");//represents a collection of classes assigned to the element.
    }else{
        //Clears the error message displayed in the emailError element.
        emailError.textContent = "";
        emailInput.classList.remove("error-input");
    }}

    //validate login username
    let loginInput = document.getElementById("login");
    let loginError = document.getElementById("loginError");
    loginInput.addEventListener("blur", validateLogin);
    function validateLogin(){
        let loginUserName = loginInput.value;
        //if loginName is empty or consists only of whitespace characters, and false otherwise.
        if(loginUserName.trim() === ""){
            loginError.textContent = "\u2718 Username should be non-empty,and less than 30 characters long"
            loginInput.classList.add("error-input");
        }else{
            loginError.textContent = "";
            loginInput.classList.remove("error-input");
            loginInput.value = loginUserName.toLowerCase();
        }
    }

    //validate user password
    let passwordInput = document.getElementById("pass");
    let passwordError = document.getElementById("passwordError");
    passwordInput.addEventListener("blur", validatePassword);
    function validatePassword(){
        let password = passwordInput.value;
        if (password.length < 8){
            passwordError.textContent = "\u2718 Password should be at least 8 characters long";
            passwordInput.classList.add("error-input");
        }else{
            passwordError.textContent = "";
            passwordInput.classList.remove("error-input");
        }
    }

    //validate both the password fields have the same value and are not blank
    let retypePasswordInput = document.getElementById("pass2");
    let passwordError2 = document.getElementById("passwordError2");
    retypePasswordInput.addEventListener("blur", validatePasswords);
    function validatePasswords() {
        let password = passwordInput.value;
        let retypePassword = retypePasswordInput.value;
        if(  password.trim()==="" || retypePassword.trim()==="" || password !== retypePassword){
            passwordError2.textContent ="\u2718 Please retype passsword";
            retypePasswordInput.classList.add("error-input");
        }else{
            passwordError2.textContent ="";
            passwordInput.classList.remove("error-input");
            retypePasswordInput.classList.remove("error-input");
        }
    }

    //validate the newsletter checkbox
    let newsletterCheckbox = document.getElementById("newsletter");
    newsletterCheckbox.addEventListener("change", popNewsletterCheckbox);
    function popNewsletterCheckbox(){
        if(newsletterCheckbox.checked){
            alert("Warning: By selecting to receive the newsletter, you may receive spam emails")
        }
    }

    //validate the terms checkbox
    let termsCheckboxInput = document.getElementById("terms");
    let termsCheckboxError = document.getElementById("termsError");
    termsCheckboxInput.addEventListener("change", validateTerms);//the change event is triggered when an element's value changes and then loses focus, while the blur event is triggered when an element loses focus
    function validateTerms(){
    if (termsCheckboxInput.checked){
        termsCheckboxError.textContent = "";
        termsCheckboxInput.classList.remove("error-input");
    }else{
        termsCheckboxError.textContent = "\u2718 Please accept the terms and conditions";
        termsCheckboxInput.classList.add("error-input");
    }}
    
    //Function to validate the signform
    function validate(){
        validateEmail();
        validateLogin();
        validatePassword();
        validatePasswords();
        validateTerms();
        if(
            emailError.textContent == "" && 
            loginError.textContent == "" &&
            passwordError.textContent == "" &&
            passwordError2.textContent =="" &&
            termsCheckboxError.textContent == ""

        ){return true;

        }return false;
    }


    //Retrieves the form element from the page
    let form = document.querySelector("form");//retrieve the first form element from the document, and assigns it to the variable form.
    form.addEventListener("reset", resetError);
    // Function to reset the form error messages
    function resetError(){
        emailError.textContent = "";
        emailInput.classList.remove("error-input");
        loginError.textContent = "";
        loginInput.classList.remove("error-input");
        passwordError.textContent = "";
        passwordInput.classList.remove("error-input");
        passwordError2.textContent ="";
        passwordInput.classList.remove("error-input");
        retypePasswordInput.classList.remove("error-input");
        termsCheckboxError.textContent = "";
        termsCheckboxInput.classList.remove("error-input");
    }

    