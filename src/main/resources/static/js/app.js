//Criacao do modulo principal da aplicacao
var appLivro = angular.module("appLivro", [ 'ngRoute' ]);

appLivro.config(function($routeProvider, $locationProvider) {

	$routeProvider
	.when("/registar", {
		templateUrl : 'pages/registarLivro.html',
		controller : 'livroController'
	}).when("/cadastrar", {
		templateUrl : 'pages/autor.html',
		controller : 'autorController'

	}).otherwise({
		rediretTo : '/'
	});
	
	$locationProvider.html5Mode(true);
	

	
});

