# springboot-web-demo
springboot-web-demo




Open https://killercoda.com/playgrounds/scenario/kubernetes

kubectl apply -f https://raw.githubusercontent.com/pzombade/springboot-web-demo/master/deployment.yml


Wait until the spring1 pod goes in the running state:
kubectl get all

NAME                           READY   STATUS    RESTARTS   AGE
pod/spring1-6f7867685c-pmx4p   1/1     Running   0          3m48s

NAME                 TYPE        CLUSTER-IP   EXTERNAL-IP   PORT(S)   AGE
service/kubernetes   ClusterIP   10.96.0.1    <none>        443/TCP   2d9h

NAME                      READY   UP-TO-DATE   AVAILABLE   AGE
deployment.apps/spring1   1/1     1            1           3m48s

NAME                                 DESIRED   CURRENT   READY   AGE
replicaset.apps/spring1-6f7867685c   1         1         1       3m48s
