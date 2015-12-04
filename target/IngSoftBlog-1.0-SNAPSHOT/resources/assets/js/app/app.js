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


IngSoftBlog.config(['$routeProvider','$httpProvider',
    function($routeProvider, $httpProvider) {
        $routeProvider.
                when('/editor', {
                    templateUrl: 'assets/js/app/views/admin.html',
                    controller: 'adminController'
                }).when('/login', {
                    templateUrl: 'assets/js/app/views/login.html',
                    controller: 'loginController'
                }).when('/', {
                    templateUrl: 'assets/js/app/views/home.html',
                    controller: 'homeController'
                }).otherwise({
                    redirectTo: '/'
                });
                
                $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';
}])
        .run(['$rootScope','$location','authService', function ($rootScope, $location, authService) {
            $rootScope.$on("$routeChangeStart", function (event, next, current) {
                if (next.templateUrl === "assets/js/app/views/admin.html") { 
                    authService.login().then(function(response) {
                        if (!response.success) 
                            $location.path('/login');
                    });
                    
                }
            });
        }]);
