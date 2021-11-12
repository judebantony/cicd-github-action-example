
Be sure you have kubectl installed and credentials to access your
kubernetes cluster.

Edit harness-delegate.yaml to change namespace, set proxy settings, or to
enter a delegate description.

Install or replace the Harness Delegate:

  kubectl apply -f harness-delegate.yaml

Get pod names:

   kubectl get pods -n harness-delegate

See startup logs:

   kubectl logs <pod-name> -n harness-delegate -f

Run a shell in a pod:

   kubectl exec <pod-name> -n harness-delegate -it -- bash

Note: If you're installing more than one Kubernetes delegate then make sure the
name is unique, keeping the 6 letter account identifier as part of the name. You
can download again with a new name from the Harness > Setup > Installations
page.
