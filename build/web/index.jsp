<%-- 
    Document   : index
    Created on : 31 Mar, 2021, 5:49:18 PM
    Author     : Anmol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Absolute Learn LMS</title>

        <link rel="stylesheet" href="contents/style.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"/>
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/typed.js/2.0.11/typed.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/waypoints/4.0.1/jquery.waypoints.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css"/>

    </head>
    <body>
        <div class="scroll-up-btn">
            <i class="fas fa-angle-up"></i>
        </div>
        <nav class="navbar">
            <div class="max-width">
                <div class="logo"><a href="logo.jpeg">Absolute<span>learn</span></a></div>
                <ul class="menu">
                    <li><a href="#home" class="menu-btn">Home</a></li>
                    <li><a href="#about" class="menu-btn">About Us</a></li>
                    <li><a href="#services" class="menu-btn">Services</a></li>
                    <li><a href="#skills" class="menu-btn">Vision & Mission</a></li>
                    <li><a href="#teams" class="menu-btn">Mentors</a></li>
                    <li><a href="#contact" class="menu-btn">Contact us</a></li>
                </ul>
                <div class="menu-btn">
                    <i class="fas fa-bars"></i>
                </div>
            </div>
        </nav>

        <!-- home section start -->
        <section class="home" id="home">
            <div class="max-width">
                <div class="row">
                    <div class="home-content">
                        <div class="text-1">The ultimate LMS customised for educators</div>
                        <div class="text-2">Absolute Learn</div>
                        <div class="text-3">join us <span class="typing"></span></div>
                        <a href="loginPage.jsp">Login Now</a>
                    </div>
                </div>
            </div>
        </section>

        <!-- about section start -->
        <section class="about" id="about">
            <div class="max-width">
                <h2 class="title">About us</h2>
                <div class="about-content">
                    <div class="column left">
                        <img src="contents/images/profile.jpeg" alt="">
                    </div>
                    <div class="column right">
                        <div class="text"> WHY ABSOLUTE LEARN? <span class="typing-2"></span></div>
                        <p>Absolute Learn aims to fulfill the respective needs of all the members in an educational ecosystem. The state-of-the-art LMS organises content in one location for the comfort of educators. This is a robust software for school administration to lead in the aspects of formal documentation, performance tracking and strengthening the process of E-learning.</p>
                        <div class="column right">
                            <div class="text">WHO CAN GET BENEFIT FROM ABSOLUTE LEARN? <span class="typing-2"></span></div>
                            <P>Every individual sharing an interest in the field of education can leverage the innovative E-learning experience of Absolute Learn. They can be institutes, teachers and the students.</P>
                            <a href="loginPage.html">Start your journey with us</a>
                        </div>
                    </div>
                </div>
            </div> 
            <!-- services section start -->
            <section class="services" id="services">
                <div class="max-width">
                    <h2 class="title">Our services</h2>
                    <div class="serv-content">
                        <div class="card">
                            <div class="box">
                                <i class="fas fa-paint-brush"></i>
                                <div class="text">Automated Performance Assessment</div>
                                <p>Absolute Learn makes it easy to assess the performance of the classes and adjudge prominent changes that can be made.</p>
                            </div>
                        </div>
                        <div class="card">
                            <div class="box">
                                <i class="fas fa-chart-line"></i>
                                <div class="text">Virtual Classroom</div>
                                <p>A disciplined atmosphere supports intuitive education. Teach your students in a tech-enabled, seamlessly interactive virtual classroom.</p>
                            </div>
                        </div>
                        <div class="card">
                            <div class="box">
                                <i class="fas fa-code"></i>
                                <div class="text">Live Lecture & Discussion</div>
                                <p>Feel the essence of sharing knowledge live over an Internet-enabled platform. Effective discussion engages the students to earn lessons with Absolute Learn.</p>
                            </div>
                        </div>
                    </div>
                </div>

            </section>

            <!-- skills section start -->
            <section class="skills" id="skills">
                <div class="max-width">
                    <h2 class="title">Our Vision & Mission </h2>
                    <div class="skills-content">
                        <div class="center">
                            <h4 class="text" class="column center">Our Vision</h4><center><p>
                                    E-Learning alignment contributes to: "inclusive learning environment", "innovative and outstanding teaching", "develop skills for life".</p></center><br>
                            <h4 class="text" class="column center">Our Mision</h4><p>
                                    Creating community and knowledge around quality online, blended, and digital learning while driving innovation.</p>

                        </div>        
                        </section>

                        <!-- teams section start -->
                        <section class="teams" id="teams">
                            <div class="max-width">
                                <h2 class="title">Our Mentors</h2>
                                <div class="carousel owl-carousel">
                                    <div class="card">
                                        <div class="box">
                                            <img src="contents/images/ansarisir.jpeg" alt="">
                                            <div class="text">Prof Ansari Nasir<br> Co-ordinator B.Sc(IT)</div>
                                            <p>Getting trained under your supervision is an incredible experience. Thank you Sir for all your support !</p>
                                        </div>
                                    </div>
                                     <div class="card">
                                        <div class="box">
                                            <img src="contents/images/sheetalmaam.jpeg" alt="">
                                            <div class="text">Prof Sheetal Mathew kadantot</div>
                                            <p>Your supervision has never failed us to bring out the best from us, and amaze the people. All the credit of our success goes to you. Thanks a lot Maam!</p>
                                        </div>
                                    </div>
                                    <div class="card">
                                        <div class="box">
                                            <img src="contents/images/arunsir.jpeg" alt="">
                                            <div class="text">Prof Arun Maurya</div>
                                            <p>Mentoring is not only about training on or off the field. Guiding someone to choose the right path, differentiate between wrong and right is also significant. Thank you for mentoring us so well.</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </section>

                        <!-- contact section start -->
                        <section class="contact" id="contact">
                            <div class="max-width">
                                <h2 class="title">Contact us</h2>
                                <div class="contact-content">
                                    <div class="column left">
                                        <div class="text">Get in Touch with us </div>
                                        <p></p>
                                        <div class="icons">
                                            <div class="row">
                                                <i class="fas fa-user"></i>
                                                <div class="info">
                                                    <div class="head">Name</div>
                                                    <div class="sub-title">Absolute Learn</div>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <i class="fas fa-map-marker-alt"></i>
                                                <div class="info">
                                                    <div class="head">Address</div>
                                                    <div class="sub-title">Mumbai, Maharastra</div>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <i class="fas fa-envelope"></i>
                                                <div class="info">
                                                    <div class="head">Email </div>
                                                    <div class="sub-title">absolutelearn1@gmail.com</div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="column right">
                                        <div class="text">Message me</div>
                                        <form class="contact-form" action="#" method="POST">
                                            <div class="fields">
                                                <div class="field name">
                                                    <input type="text" class="fullname" placeholder="Name">
                                                </div>
                                                <div class="field email">
                                                    <input type="text" class="email-input" placeholder="Email">
                                                </div>
                                            </div>
                                            <div class="field">
                                                <input type="text" class="subject" placeholder="Subject">
                                            </div>
                                            <div class="field textarea">
                                                <textarea class="message" cols="30" rows="20" placeholder="Message.."></textarea>
                                            </div>
                                            <div class="button-area">
                                                <a href="https://mail.google.com/mail/u/0/#inbox">
                                                <button class="send-msg" type="submit" name="send">Send message</button></a>
                                                
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </section>

                        <!-- footer section start -->
                        <footer>
                            <span>Created By Niraj Jain and Suraj soni<a href="https://niraj04.medium.com/">AbsoluteLearn</a><span class="far fa-copyright"></span> 2020 All rights reserved.</span>
                        </footer>
                        <script src="contents/script.js"></script>
                        </body>
                        </html>

