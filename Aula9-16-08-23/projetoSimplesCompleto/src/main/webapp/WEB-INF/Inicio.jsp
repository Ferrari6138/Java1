<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Business Website</title>
    
    <style>
    
		    	/* Reset some default styles */
		body, h1, h2, h3, p, ul, li {
		    margin: 0;
		    padding: 0;
		}
		
		/* Set a background color and text color for the body */
		body {
		    font-family: Arial, sans-serif;
		    background-color: #acacac;
		    color: #333;
		    margin: 0;
		    padding: 0;
		}
		
		/* Style the header and navigation */
		header {
		    background-color: #0073e6;
		    color: #fff;
		    padding: 10px 0;
		}
		
		nav ul {
		    list-style: none;
		}
		
		nav ul li {
		    display: inline;
		    margin-right: 20px;
		}
		
		nav ul li a {
		    text-decoration: none;
		    color: #fff;
		    font-weight: bold;
		}
		
		/* Style the hero section */
		.hero {
		    text-align: center;
		    padding: 100px 0;
		    background-image: url('hero-bg.jpg');
		    background-size: cover;
		    color: #fff;
		}
		
		.hero h1 {
		    font-size: 36px;
		}
		
		.hero p {
		    margin-top: 20px;
		}
		
		#learn-more {
		    background-color: #0073e6;
		    color: #fff;
		    border: none;
		    padding: 10px 20px;
		    font-size: 18px;
		    cursor: pointer;
		}
		
		/* Style the services section */
		.services {
		    text-align: center;
		    padding: 40px 0;
		}
		
		.service {
		    margin: 20px;
		    padding: 20px;
		    border: 1px solid #ddd;
		    border-radius: 5px;
		    background-color: #fff;
		    box-shadow: 0 0 5px rgba(0, 0, 0, 0.2);
		}
		
		.service h3 {
		    font-size: 24px;
		    margin-bottom: 10px;
		}
		
		/* Style the about us and contact sections */
		.about-us, .contact {
		    text-align: center;
		    padding: 40px 0;
		}
		
		/* Style the footer */
		footer {
		    text-align: center;
		    background-color: #333;
		    color: #fff;
		    padding: 10px 0;
		}
		    	
    </style>
    
</head>
<body>
    <header>
        <nav>
            <ul>
                <li><a href="#">Home</a></li>
                <li><a href="#">Services</a></li>
                <li><a href="#">About Us</a></li>
                <li><a href="#">Contact</a></li>
            </ul>
        </nav>
    </header>

    <section class="hero">
        <h1>Welcome to Our Business</h1>
        <p>Your Trusted Partner for Solutions</p>
        <button id="learn-more">Learn More</button>
    </section>

    <section class="services">
        <h2>Our Services</h2>
        <div class="service">
            <h3>Service 1</h3>
            <p>Service 1 description goes here.</p>
        </div>
        <div class="service">
            <h3>Service 2</h3>
            <p>Service 2 description goes here.</p>
        </div>
        <div class="service">
            <h3>Service 3</h3>
            <p>Service 3 description goes here.</p>
        </div>
    </section>

    <section class="about-us">
        <h2>About Us</h2>
        <p>Learn more about our company and our mission.</p>
    </section>

    <section class="contact">
        <h2>Contact Us</h2>
        <p>If you have any questions, feel free to reach out to us.</p>
    </section>

    <footer>
        <p>&copy; 2023 Business Website. All rights reserved.</p>
    </footer>

    <script>
 // JavaScript code can be added here for interactivity
    document.getElementById('learn-more').addEventListener('click', function() {
        alert('Learn more button clicked!');
    });

    </script>
</body>
</html>



