/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/* global angular */

var IngSoftBlog = angular.module("IngSoftBlog", [
    'ngRoute',
    'ui.bootstrap',,
    'ui.grid',
    'ingsoftblogServices',
    'ingsoftblogControllers',
    'currencyMask',
    'lodash'
    
]);


IngSoftBlog.config(['$routeProvider','$locationProvider',
    function($routeProvider, $locationProvider) {
        $routeProvider.
                when('/editor', {
                    templateUrl: 'assets/js/app/views/admin.html',
                    controller: 'adminController'
                }).when('/editar/:postId', {
                    templateUrl: 'assets/js/app/views/editar.html',
                    controller: 'editController'
                }).when('/login', {
                    templateUrl: 'assets/js/app/views/login.html',
                    controller: 'loginController'
                }).when('/', {
                    templateUrl: 'assets/js/app/views/home.html',
                    controller: 'homeController'
                }).when('/post/:postId', {
                    templateUrl: 'assets/js/app/views/post.html',
                    controller: 'postController'
                }).otherwise({
                    redirectTo: '/'
                });
                
                $locationProvider.html5Mode(true);
}])
        .run(['$rootScope','$location','authService', function ($rootScope, $location, authService) {
            $rootScope.$on("$routeChangeStart", function (event, next, current) {
                if (next.templateUrl === "assets/js/app/views/admin.html" || next.templateUrl === "assets/js/app/views/editar.html") { 
                    authService.login().then(function(response) {
                        if (!response.success) 
                            $location.path('/login');
                    });
                    
                }
            });
        }]);