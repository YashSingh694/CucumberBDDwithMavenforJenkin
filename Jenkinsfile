 
pipeline{
agent any
stages 
{
stage('Build') 
{
steps{
echo "Building the Code.........."
//bat "mvn clean"
sh "mvn clean"
}
}
stage('Test') 
{
steps{
echo "Testing the Code.........."
//bat "mvn test"
sh "mvn test"
}
}
stage('Compile') 
{
steps{
echo "Compiling the Project.........."
//bat "mvn compile"
sh "mvn compile"
}
}
stage('Deploy') 
{
steps{
echo "Deploying the Project.........."
}
}
}
}
