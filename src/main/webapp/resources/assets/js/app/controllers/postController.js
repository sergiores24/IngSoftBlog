/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var controllerModule = angular.module('ingsoftblogControllers');

controllerModule.controller('postController', ['$scope','postService', 
    '$routeParams', '$location', '_',
    function($scope, postService, $routeParams, $location, _) {
        $scope.getPost = function(postId) {
            postService.getPostById(postId).then(function(response) {
                $scope.post = response.data;
            });
        };
        if ($routeParams.postId) {
            $scope.getPost(parseInt($routeParams.postId));
        } else {
            $location.path('/');
        }
        
    }]);