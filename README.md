mvn dependency:sources
mvn clean install dependency:sources -Dmaven.test.skip=true


    protected static String YOUR_APP_ID = "8ED00D4B-240E-B654-FF92-8E5E8C6F0100";
    protected static String YOUR_SECRET_KEY = "B99DC1B0-228F-7CB2-FFAB-295D023A9200";

Retrieve the data
curl -H application-id:8ED00D4B-240E-B654-FF92-8E5E8C6F0100 -H secret-key:B99DC1B0-228F-7CB2-FFAB-295D023A9200 -H Content-Type:application/json -v https://api.backendless.com/v1/data/need
curl -H application-id:8ED00D4B-240E-B654-FF92-8E5E8C6F0100 -H secret-key:B99DC1B0-228F-7CB2-FFAB-295D023A9200 -H Content-Type:application/json -v https://api.backendless.com/v1/data/need/48BBED11-3104-4EF3-FF32-957018555500

curl -H application-id:8ED00D4B-240E-B654-FF92-8E5E8C6F0100 -H secret-key:B99DC1B0-228F-7CB2-FFAB-295D023A9200 -H Content-Type:application/json -v https://api.backendless.com/v1/data/need?where=description like '%o%'
curl -H application-id:8ED00D4B-240E-B654-FF92-8E5E8C6F0100 -H secret-key:B99DC1B0-228F-7CB2-FFAB-295D023A9200 -H Content-Type:application/json -v https://api.backendless.com/v1/data/need?where=description%20like%20%27%25o%25%27

Get the schema https://api.backendless.com/v1/data/need/properties
