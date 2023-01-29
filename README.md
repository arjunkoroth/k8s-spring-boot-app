# Spring Boot + Mysql App with Kubernetes deployment configuration

## This is a spring boot app that can be used to learn K8s deployment

For local development and deployment install [Docker](https://www.docker.com/)  and [Minikube](https://minikube.sigs.k8s.io/docs/start/)

- Kubernetes Official Documentation : [Kubernetes](https://kubernetes.io/docs/home/)

- Query to create the table in the database used in this example
```
CREATE TABLE `user_details` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
)
```
### Docker command to build web app image
```
docker build . -f .\Dockerfile -t k8-demo-app:1.0
```
Basic Kubernetes commands to deploy all the components (directory K8s-config)

1. Apply config map and secrets
```
kubectl apply -f .\mysql-config.yml
kubectl apply -f .\mysql-secret.yml
```
2. Apply mysql storage
```
kubectl apply -f .\mysql-storage.yml
```
3. Deploy mysql db
```
kubectl apply -f .\mysql-deployment.yml
```
4. Deploy web application
```
kubectl apply -f .\webapp-deployment.yml
```

Kubernetes command to get into the mysql pod
```
kubectl exec --stdin --tty <MYSQL_POD_NAME> -- /bin/bash
```