package ZaiziAlfresco.ESUberChecking;

import java.io.File;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.node.Node;
import org.elasticsearch.node.NodeBuilder;

import static org.elasticsearch.node.NodeBuilder.*;

public class App
{
    public static void main( String[] args ) throws Exception
    {
        
        
        
        TransportClient client = TransportClient.builder().build().addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"), 9300));
        
/*      SearchResponse response = client.prepareSearch("logstash-2016.02.15")
      .setTypes("alfresco")
      .setQuery(QueryBuilders.matchQuery("type", "alfresco"))                 // Query
      .execute()
      .actionGet();

System.out.println( "Hello World! " + response.toString());*/
        
        System.out.println("This is working");
    }
}
