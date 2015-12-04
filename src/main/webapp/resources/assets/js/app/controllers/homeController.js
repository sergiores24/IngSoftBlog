/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* global angular */

var controllerModule = angular.module('ingsoftblogControllers');

controllerModule.controller('homeController', ['$scope', 'postService', '_', 
    function ($scope, postService, _) {
        $scope.posts = [];

        $scope.getAllPosts = function () {
            var promise = postService.getAllPosts();
            promise.then(function (response) {
                $scope.posts = response.data;
            });
        };
        
        $scope.getAllPosts();
    }]);





