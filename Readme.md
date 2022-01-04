

springboot-docker-example-4 

get
```
curl --location --request GET 'http://localhost:8080/api/v1/product/get'
```

post 

```
curl --location --request POST 'http://localhost:8080/api/v1/product/save' \
--header 'Content-Type: application/json' \
--data-raw '    {
"id": 7,
"name": "P1"
}'
```


minikube start



* create pod
- kubectl apply -f client-pod.yaml
* create service
- kubectl apply -f client-node-port.yaml

** check minikube ip
- minikube ip

* delete pod
- kubectl delete pods  client-pod
* delete service
- kubectl delete services  client-node-port

* pod describe
- kubectl describe pod client-pod


* get info
- kubectl get pods

+ deployment
 - kubectl apply -f client-deployment.yaml
 - kubectl get deployments


delete deployment 
kubectl delete deployment client-deployment

delete service
kubectl delete service client-node-port
  
get details 
+ kubectl get pods -o wide



* pod log check
- kubectl logs client-pod  --previous --tail 10


run all script inside folder
> kubectl apply -f simplek8s-3-cluster

    ➜  ~ echo -n 'user-cm' | base64
    dXNlci1jbQ==
    ➜  ~
    ➜  ~ echo -n 'rootcm' | base64
    cm9vdGNt
- 
- kubectl create -f secrets.yaml


> https://github.com/ashutoshsahoo/spring-boot-kubernetes-mysql

* export mysql shell
- kubectl exec --stdin --tty mysql-7b47cf76f7-fnz7w -- /bin/bash
  
- ALTER USER 'user-cm'@'%' IDENTIFIED WITH mysql_native_password BY 'rootcm';
  GRANT SELECT, ALTER, CREATE, DELETE, DROP, INDEX, INSERT, REFERENCES, TRIGGER, UPDATE ON productdb.* TO 'user-cm'@'%';
- SELECT user,authentication_string,plugin,host FROM mysql.user;
https://kubernetes.io/docs/tasks/access-application-cluster/port-forward-access-application-cluster/

### kubectl port-forward deployment/mysql :3306

kubectl port-forward deployment/client-three-deployment :8080
- docker build -t cmabdullah21/spring-boot-docker-v04 --progress=plain .
- docker push cmabdullah21/spring-boot-docker-v05

lecture 214
update pod image from cluster

> kubctl set image client-deployment client=cmabdullah21/spring-boot-docker-v01:version-tag

eval $(minikube docker-env)


remove cache
docker system prune -a

kubectl get storageclass
kubectl describe storageclass

kubectl get pv
kubectl get pvc

creating encoded secret
kubctl create secret generic pgpassword --from-literal PGPASSWORD=1234abcd

kubctl get secrets 

https://github.com/shameed1910/springboot-k8s-mysql/tree/master/springboot-k8s-mysql/src/main/resources
https://github.com/ashutoshsahoo/spring-boot-kubernetes-mysql/blob/master/deployment/secrets.yaml


# http://localhost:5050/login?next=%2F

# docker build -t cmabdullah21/spring-boot-docker-v05 --progress=plain .
# docker-compose -f docker-compose.yml up

➜  ~ kubectl create secret generic pgpassword --from-literal PGPASSWORD=admin
secret/pgpassword created
➜  ~

https://stackoverflow.com/questions/2172569/how-do-i-login-and-authenticate-to-postgresql-after-a-fresh-install