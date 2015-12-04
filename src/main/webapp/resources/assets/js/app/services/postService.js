/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* global apiUrl, angular */

var servicesModule = angular.module('ingsoftblogServices');
servicesModule.factory('postService', ['$http', function ($http) {
        return {
            apiUrl: apiUrl,
            getAllPosts: function () {
                return $http.get(this.apiUrl + 'post/');
            },
            getPostById: function (postId) {
                return $http.get(this.apiUrl + 'post/' + postId);
            },
            publicarPost: function (post) {
                return $http.put(this.apiUrl + 'post/', post);
            },
            editarPost: function (post) {
                return $http.post(this.apiUrl + 'post/', post);
            },
            eliminarPost: function (post){
                return $http.delete(this.apiUrl + 'post/' +"eliminar/"+ post.id);
            }
        };
    }]);


