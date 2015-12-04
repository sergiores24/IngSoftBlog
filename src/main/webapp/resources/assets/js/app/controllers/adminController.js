/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var controllerModule = angular.module('ingsoftblogControllers');

controllerModule.controller('adminController', ['$scope', '$uibModal', '$location', 'postService', '_',
    function ($scope, $uibModal, $location, postService, _) {
        
        $scope.posts = [];

        $scope.getAllPosts = function () {
            postService.getAllPosts()
                    .then(function (response) {
                        $scope.posts = response.data;
                    });
        };

        $scope.addPost = function () {
            $uibModal.open({
                templateUrl: 'addPostModal',
                controller: 'adminController.addPostModal',
                size: 'md'
            }).result.then(function (m) {
                postService.publicarPost(m)
                        .then(function () {
                            $scope.getAllPost();
                        });
            });
        };
        
        $scope.editPost = function (id) {
            $location.path('/editar/' + id);
        };
        
        $scope.eliminarPost= function(algo){
            console.log("eliminar post object", algo);
            postService.eliminarPost(algo)
                    .then(function () {
                            $scope.getAllPosts();
                        });
        };
       
        $scope.getAllPosts();
    }]);

controllerModule.controller('adminController.addPostModal', ['$scope', '$modalInstance', function ($scope, $modalInstance) {
        $scope.post = {};

        $scope.cancel = function () {
            $modalInstance.dismiss('cancel');
        };

        $scope.ok = function () {

            $modalInstance.close($scope.post);
        };
    }]);