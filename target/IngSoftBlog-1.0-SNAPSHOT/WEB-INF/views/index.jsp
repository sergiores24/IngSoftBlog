<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html ng-app="IngSoftBlog">
   <head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>IngSoftBlog</title>

    <!-- Bootstrap Core CSS -->
    <link href="/IngSoftBlog/assets/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="/IngSoftBlog/assets/css/blog-post.css" rel="stylesheet">
    <link href="/IngSoftBlog/assets/css/ui-grid.min.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <!-- Navigation -->
    <nav ng-controller="navbarController"  class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#/">IngSoftBlog</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="navbar-collapse collapse navbar-responsive-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="#/">Inicio</a>
                    </li>
                    <li>
                        <a href="#/editor/">Editor</a>
                    </li>
                    <li ng-show="loggedIn"><a href="" ng-click="logout()">Logout</a></li>
                    <li ng-show="!loggedIn"><a href="" ng-click="login()">Login</a></li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
    
    <div ng-view autoscroll>

    </div>
    
    <!-- Page Content -->
    <div class="container">
        <hr>

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; IngSoftBlog 2015</p>
                </div>
            </div>
            <!-- /.row -->
        </footer>

    </div>
    <!-- /.container -->
</body>

</html>
</html>





<script>
    apiUrl = "${apiUrl}";
</script>


<script src="assets/js/lib/jquery-1.11.1.min.js"></script>


<script src="assets/js/lib/lodash.min.js"></script>


<script src="assets/js/lib/angular.min.js"></script>
<script src="assets/js/lib/angular-route.min.js"></script>
<script src="assets/js/lib/angular-currency-mask.js"></script>
<script src="assets/js/lib/ui-grid.min.js"></script>


<script src="assets/js/lib/bootstrap.min.js"></script>


<script src="assets/js/lib/ui-bootstrap-tpls-0.14.0.min.js"></script>

<script src="assets/js/lib/textAngular.min.js"></script>

<script src="assets/js/app/moduleRegistration.js"></script>
<script src="assets/js/app/services/postService.js"></script>
<script src="assets/js/app/services/authService.js"></script>
<script src="assets/js/app/controllers/homeController.js"></script>
<script src="assets/js/app/controllers/navbarController.js"></script>
<script src="assets/js/app/controllers/loginController.js"></script>
<script src="assets/js/app/controllers/adminController.js"></script>
<script src="assets/js/app/app.js"></script>
