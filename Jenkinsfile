pipeline {
    agent any

    stages {

	   stage('Git Checkout') {
			steps {
				git branch: 'main',
					url: 'https://github.com/lovachittumuri/springboot-curd-application.git'
			}
		}

        stage('Build') {
            steps {
                echo 'Building Spring Boot Application'

                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                echo 'Running Application Tests'

                bat 'mvn test'
            }
        }

        stage('Docker Build') {
            steps {
                echo 'Building Docker Image'

                //bat 'docker build .'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying Spring Boot and MySQL Containers'

                bat 'docker compose -f compose.yml up'

            }
        }

        stage('Verify Deployment') {
            steps {
                bat 'docker compose ps'
            }
        }
    }

    post {
        success {
            echo 'CI/CD Pipeline Completed Successfully!'
        }

        failure {
            echo 'CI/CD Pipeline Failed. Please Check Jenkins Console Output.'
        }
    }
}
