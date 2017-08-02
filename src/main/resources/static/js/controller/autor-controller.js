appLivro.controller ("autorController", function  ($scope, $http){
	

	$scope.registarAutor= function (){

		
		$http({method:'POST', url:'/cadastrar',data:$scope.autor})
		.then(function (response){
			//$scope.clientes.push(response.data) ;
		
			
//			$scope.frmCliente.$setPristine(true);


		} , function (response){
			console.log(response.data);
			console.log(response.status);

		});
		
		

	
}

		});