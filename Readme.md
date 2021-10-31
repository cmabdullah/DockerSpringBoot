

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

* pod log check
- kubectl logs client-pod  --previous --tail 10


    ➜  ~ echo -n 'user-cm' | base64
    dXNlci1jbQ==
    ➜  ~
- 
- kubectl create -f secrets.yaml


> https://github.com/ashutoshsahoo/spring-boot-kubernetes-mysql

* export mysql shell
- kubectl exec --stdin --tty mysql-7b47cf76f7-fnz7w -- /bin/bash

https://kubernetes.io/docs/tasks/access-application-cluster/port-forward-access-application-cluster/

### kubectl port-forward deployment/mysql :3306

- docker build -t cmabdullah21/spring-boot-docker-v04 --progress=plain .
- docker push cmabdullah21/spring-boot-docker-v05


