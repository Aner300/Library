appLivro.controller ("livroController", function  ($scope, $http,$location){
	
	
	$scope.livros=[];
	$scope.livro={}; //Bind com o form
	
	carregaLivros= function (){
		
	
		$http({method:'GET', url:'/pesquisarLivro'})
		.then(function (response){
			$scope.livros=response.data;
			
		} , function (response){
			console.log(response.data);
			console.log(response.status);
			
		});
	};
	
	$scope.cancel = function () {
	    $modalInstance.dismiss('cancel');
	};
	
$scope.registarLivro= function (){

		
			$http({method:'POST', url:'/registar',data:$scope.livro})
			.then(function (response){
				//$scope.clientes.push(response.data) ;
				carregaLivros();
				$scope.cancelarRegistoLivro();
				
				
//				$scope.frmCliente.$setPristine(true);


			} , function (response){
				console.log(response.data);
				console.log(response.status);

			});
			
			

		
	}

$scope.cancelarRegistoLivro=function (){
	$scope.livro={};
};

carregaLivros();


});
