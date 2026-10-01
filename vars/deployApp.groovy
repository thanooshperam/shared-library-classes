def call(Map config=[:]){
    def appName=config.get('appName','demo-app')
    def port=config.get('port','3000')
    def envirnoment=config.get('environment','dev')

    echo 'Starting the app......'

    echo "App Name:${appName}"
    echo "Port:${port}"
    echo "Environment:${Environment}"

    echo "Deployment Completed...."

}