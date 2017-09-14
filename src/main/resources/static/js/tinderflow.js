var app = angular.module('tinderflow', ['ngResource', 'ngRoute', 'ui.bootstrap']);

app.config(['$routeProvider', function($routeProvider){
    $routeProvider
        .when('/', {
            templateUrl: 'partials/home.html',
            controller : 'HomeCtrl'
        })
        .when('/demo', {
            templateUrl: 'partials/demo.html',
            controller : 'DemoCtrl'
        })
        .when('/finalTally', {
            templateUrl: 'partials/finalTally.html',
            controller : 'FinalTallyCtrl'
        })
        .otherwise({
            redirectTo: '/'
        });
}]);

app.service('dataService', function($http) {
    return $http.get('/data', {cache : true});
});

app.controller('HomeCtrl', ['$scope', '$location',
	function ($scope, $location) {

            $scope.goToHome = function() {
                $location.path('/');
            }

            $scope.goToDemo = function() {
                $location.path('/demo');
            }
            
            $scope.goToInfo = function() {
                $location.path('/info');
            }

}]);

app.controller('DemoCtrl', ['$scope', '$resource', '$location', 'dataService',
    function ($scope, $resource, $location, dataService) {

            $scope.goToHome = function() {
                $location.path('/');
            }

            dataService.then(function(response) {
                console.log(response.data);
            });


//            $scope.myInterval = 3000;

            $scope.slides = [
                {
                  text: 'this is a good commit message'
                },
                {
                  text: 'this one is kinda lame'
                },
                {
                  text: 'what will they say about this one?'
                },
                {
                  text: 'a good way to end the demo!'
                }
              ];

}]);

app.controller('FinalTallyCtrl', ['$scope', '$location', function ($scope, $location, $routeParams) {

        $scope.goToHome = function() {
            $location.path('/');
        }
   
        $scope.goToDemo = function() {
            $location.path('/demo');
        }
}]);
