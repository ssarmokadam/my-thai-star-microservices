minikube start  --memory 3072 --vm-driver="hyperv" --hyperv-virtual-switch="Primary Virtual Switch" --alsologtostderr


istioctl install --set profile=demo
kubectl label namespace default istio-injection=enabled


kubectl apply -f mts-booking-all.yaml
kubectl apply -f mts-angular-all.yaml

kubectl apply -f mts-gateway.yaml