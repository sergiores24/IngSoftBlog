/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var controllerModule = angular.module('ingsoftblogControllers');

controllerModule.controller('editController', ['$scope', '$location', 'postService', '$routeParams', '_',
    function ($scope, $location, postService, $routeParams, _) {
         $scope.getPost = function(postId) {
            console.log('id',postId);
            postService.getPostById(postId).then(function(response) {
                $scope.post = response.data;
            });
        };
        $scope.actualizar = function (post) {
                postService.editarPost(post)
                        .then(function () {
                            $location.path('post/'+ post.id);
            });
        };
        
        $scope.cancelar = function(id){
            $location.path('post/'+ id);
        };
        if ($routeParams.postId) {
            $scope.getPost(parseInt($routeParams.postId));
        } else {
            $location.path('/');
        }
       
    }]);