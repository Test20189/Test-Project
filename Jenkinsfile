pipeline 
{
  	agent any
	stage('myStage')
	{
  		agent any
 	 	when
 	 	{
   		 	branch 'master'
  	  	}
  		steps 
  		{
    		sh 'ls -la' 
  		}
  	}
}

