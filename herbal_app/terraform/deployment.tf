

resource "kubernetes_deployment_v1" "herbal_app" {
  metadata {
    name      = "herbal-app"
    namespace = "kube-system"
  }

  spec {
    replicas = 3

    selector {
      match_labels = {
        app = "herbal-app"
      }
    }

    template {
      metadata {
        labels = {
          app = "herbal-app"
        }
      }

      spec {
        container {
          name = "herbal-app"
          image = "herbal_app:latest"

          port {
            container_port = 8080
          }
        }
      }
    }
  }
}