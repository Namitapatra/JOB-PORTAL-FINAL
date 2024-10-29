<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>Login Page</title>
<style>
:root {
    --background: linear-gradient(135deg, #4e54c8, #8f94fb);
    --color: #ffffff;
    --primary-color: #ff4081;
}

* {
    box-sizing: border-box;
}

html, body {
    height: 100%;
    margin: 0;
    font-family: "Poppins", sans-serif;
    background: var(--background);
    color: var(--color);
    letter-spacing: 1px;
    transition: background 0.2s ease;
    overflow: hidden;
}

.container {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}

.login-container {
    position: relative;
    width: 26rem;
    padding: 3rem;
    background: rgba(255, 255, 255, 0.15);
    border-radius: 15px;
    backdrop-filter: blur(15px);
    box-shadow: 0 10px 25px rgba(0, 0, 0, 0.4);
    text-align: center;
    color: var(--color);
    animation: fadeIn 1.5s ease;
}

.login-container h1 {
    margin-bottom: 1.5rem;
    font-size: 2.3rem;
    letter-spacing: 2px;
    font-weight: 600;
    color: #ffffff;
    text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.4);
}

.login-container form input {
    display: block;
    width: 100%;
    padding: 1rem;
    margin-bottom: 1.5rem;
    background: rgba(255, 255, 255, 0.25);
    border: none;
    border-radius: 8px;
    color: var(--color);
    font-size: 1.1rem;
    transition: transform 0.2s ease;
    text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.3);
}

.login-container form input:focus {
    outline: none;
    box-shadow: 0 0 10px 2px var(--primary-color);
    transform: scale(1.02);
}

.login-container form button {
    width: 100%;
    padding: 1rem;
    background-color: var(--primary-color);
    border: none;
    color: white;
    font-size: 1.2rem;
    font-weight: bold;
    border-radius: 8px;
    cursor: pointer;
    transition: background 0.4s ease, transform 0.3s ease;
    box-shadow: 0 6px 15px rgba(0, 0, 0, 0.3);
}

.login-container form button:hover {
    background-color: #ff79a8;
    transform: scale(1.05);
}

.register-forget {
    display: flex;
    justify-content: space-between;
    margin-top: 1rem;
    font-size: 0.95rem;
}

.register-forget a {
    color: var(--primary-color);
    text-decoration: none;
    transition: color 0.3s ease;
}

.register-forget a:hover {
    color: #ff79a8;
    text-decoration: underline;
}

.theme-btn-container {
    margin-top: 2rem;
    display: flex;
    justify-content: center;
}

.theme-btn {
    width: 30px;
    height: 30px;
    border-radius: 50%;
    margin: 0 10px;
    cursor: pointer;
    transition: transform 0.2s ease;
}

.theme-btn:hover {
    transform: scale(1.2);
}

@keyframes fadeIn {
    0% {
        opacity: 0;
        transform: translateY(30px);
    }
    100% {
        opacity: 1;
        transform: translateY(0);
    }
}

</style>
</head>
<body>
    <section class="container">
        <div class="login-container">
            <h1>Welcome Back!</h1>
            <form>
                <input type="text" placeholder="Username" />
                <input type="password" placeholder="Password" />
                <button>Login</button>
            </form>
            <div class="register-forget">
                <a href="signup.jsp">Register</a>
                <a href="#">Forgot Password?</a>
            </div>
        </div>
        <div class="theme-btn-container"></div>
    </section>
</body>
<script>
const themes = [
    {
        background: "linear-gradient(135deg, #4e54c8, #8f94fb)",
        color: "#ffffff",
        primaryColor: "#ff4081"
    },
    {
        background: "linear-gradient(135deg, #1e3c72, #2a5298)",
        color: "#ffffff",
        primaryColor: "#03dac6"
    },
    {
        background: "linear-gradient(135deg, #f5af19, #f12711)",
        color: "#ffffff",
        primaryColor: "#ff0266"
    },
    {
        background: "linear-gradient(135deg, #12c2e9, #c471ed, #f64f59)",
        color: "#ffffff",
        primaryColor: "#bb86fc"
    }
];

const setTheme = (theme) => {
    const root = document.querySelector(":root");
    root.style.setProperty("--background", theme.background); 
    root.style.setProperty("--color", theme.color);
    root.style.setProperty("--primary-color", theme.primaryColor);
};

const displayThemeButtons = () => {
    const btnContainer = document.querySelector(".theme-btn-container");
    themes.forEach((theme) => {
        const div = document.createElement("div");
        div.className = "theme-btn";
        div.style.background = theme.primaryColor;
        btnContainer.appendChild(div);
        div.addEventListener("click", () => setTheme(theme));
    });
};

displayThemeButtons();
</script> 
</html>