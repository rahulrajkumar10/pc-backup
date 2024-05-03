document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault();
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;
  
    // Here you can validate the login credentials
    // For simplicity, let's assume a hardcoded username and password
    if (username === 'user' && password === 'password') {
      // Check if "Remember Me" is checked
      if (document.getElementById('rememberMe').checked) {
        // Here you can implement remember me functionality, such as setting cookies
        console.log('Remember Me checked');
      }
      alert('Login successful!');
      // Redirect or perform further actions after successful login
    } else {
      alert('Invalid username or password. Please try again.');
    }
  });
  
  document.getElementById('forgotPassword').addEventListener('click', function(event) {
    event.preventDefault();
    // Here you can implement the forgot password functionality, such as sending a reset link to the user's email
    alert('Forgot Password clicked');
  });
  
  