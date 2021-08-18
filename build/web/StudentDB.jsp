<%-- 
    Document   : StudentDB
    Created on : 14 Apr, 2021, 8:21:01 AM
    Author     : Anmol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title> Absolute learn Student Dashboard</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
    <link rel="stylesheet" href="contents/main%20(1).css">
</head>
<body>
    <div id="search-results" style="display: none;">
    
    </div>
    <nav class="topnav">
        <div class="logo">
            <a href="#" class="display-sm display-md" id="menu"><i class="fa fa-list-ul"></i></a>
            <a href="index.jsp" class="hidden-sm"><h1>Student Dashboard</h1></a>
        </div>
        <div class="user-menu">
            <form action="#" method="post" class="hidden-sm">
                <input type="text" name="search" id="search" placeholder="Search lec">
                <i class="fa fa-search"></i>
            </form>
            <div><BR>
                <a href="index.jsp#">ABSOLUTE LEARN</a>
                <a href="loginPage.jsp"><i class="fa fa-power-off"></i></a>
                </BR></div>
        </div>
    </nav>
   
   <aside class="sidenav hidden-sm hidden-md" id="nav">
       <div class="list">
      <a href="index.jsp#"><i class="fas fa-desktop"></i><span>Absolute Learn</span></a>
      <a href="StudentDB.jsp#Lecture"><i class="fas fa-cogs"></i><span>Lectures</span></a>
      <a href="http://itscholar.codegency.co.in/courses/bsc-it.html"><i class="fas fa-table"></i><span>Books</span></a>
      <a href="https://classroom.google.com/u/1/c/MzIzMDU2NjE5NDIw"><i class="fas fa-th"></i><span>Assighnment</span></a>
      <a href="index.jsp#contact">
          <i class="fas fa-info-circle"></i><span>Contact Us</span></a>
      </div>
   </aside>

   <main class="content">
      <div class="grid">
          <a href="index.jsp#contact">
          <div class="mini-reports bg-blue">
                <div class="l">
                    <span>BSCIT SEM 1 & 2</span>
                    <span>LECTURE</span>
                </div>
                <div class="r">
                    <i class="fa fa-book c-blue"></i>
                </div>
          </div></a>
          <a href="index.jsp#contact">
          <div class="mini-reports bg-green">
                <div class="l">
                    <span>BSCIT SEM 3 & 4</span>
                    <span>LECTURE</span>
                </div>
                <div class="r">
                    <i class="fa fa-book c-green"></i>
                </div>
          </div></a>
          <a href="index.jsp#contact">
          <div class="mini-reports bg-orange">
                <div class="l">
                    <span>BSCIT SEM 5 & 6</span>
                    <span>LECTURE</span>
                </div>
                <div class="r">
                    <i class="fa fa-book c-orange"></i>
                </div>
          </div></a>
          
      </div>

      <div class="grid">
          <div class="painel">
              <div class="painel-header">
                  <h4 class="painel-title">Table</h4>
                  <a href="#" class="btn btn-blue">Scheduling of lec </a>
              </div>
              
                <table class="zebra" id="Lecture">
                    <tr>
                        <th>SUBJECT</th>
                        <th>TIME</th>
                        <th>DATE</th>
                        <th>JOIN</th>
                    </tr>
                    <tr>
                        <td>Business Itelligence</td>
                        <td>8.15 to 9.30</td>
                        <td>15/04/2021</td>
                        <td>
                            <a href="https://us04web.zoom.us/j/76540685636?pwd=bm1lYkFzbkNFcGZWTWpIUVROeEpTUT09" class="btn btn-red">
                                <i>join Lecture</i></a>
                        </td>
                    </tr>
                    <tr>
                        <td>Cyber law </td>
                        <td>9.45 to 11.30</td>
                        <td>15/04/2021</td>
                        <td>
                            <a href="https://us05web.zoom.us/j/87484485756?pwd=dkFVNnNlZFpqSjRBSSsvK0Q0ODJNdz09" class="btn btn-blue"><i>Join Lecture</i></a>
                            
                        </td>
                    </tr>
                    
                <tr>
                        <td>Security in computing</td>
                        <td>7.30 to 8.30</td>
                        <td>16/04/2021</td>
                        <td>
                            <a href="https://us05web.zoom.us/j/81399403939?pwd=MHdBZjVUZlAxZ2JFbis3b05hOTEzQT09" class="btn btn-red"><i>Join Lecture</i></a>
                        </td>
                    </tr>
                    <tr>
                        <td>Softwware Quality Assurance</td>
                        <td>8.45 to 9.30</td>
                        <td>16/04/2021</td>
                        <td>
                            <a href="https://us04web.zoom.us/" class="btn btn-red"><i>Join 
                                Lecture</i></a>
                        </td>
                    </tr>
                    <tr>
                        <td>BI</td>
                        <td>10.00 to 11.00</td>
                        <td>15/04/2021</td>
                        <td>
                            <a href="https://us04web.zoom.us/" class="btn btn-red"><i>Join Lecture</i></a>
                        </td>
                    </tr>
                </table>
              </div>
          </div>

          <div class="painel">
              <div class="painel-header">
                  <h6 class="painel-title">Ask Doubt</h6>
              </div>
              <div class="painel-body">
                <form  class="form" action="doubt" method="POST">
                    <div class="group">
                        <label for="#">Name</label>
                        <input type="text" name="un" id="" placeholder="Name">
                    </div>
                    <div class="group">
                        <label for="#">Email</label>
                        <input type="email" id="" name ="eml"placeholder="Email">
                    </div>
                <div class="group">
                        <label for="#">Choose Subject</label>
                        <select name="sub" id="">
                            <option value="">Business itelligence</option>
                            <option value="">Software Quality Assurance</option>
                            <option value="">Cyber Law</option>
                            <option value="">Security in Computing</option>
                            <option value="">Principle of GIS</option>
                        </select>
                    </div>
                    <textarea class="form-control rounded-0" id="exampleFormControlTextarea1" name="Do" rows="10" cols="30" ></textarea>
    


                    <div class="group">
                        <input type="submit" class="btn btn-green" style="width: 40%;" value="Ask Your Doubt">
                    </div>
                    <script src="contents/main%20(1).js"></script></form></div></div></main>
</body>
</html>
