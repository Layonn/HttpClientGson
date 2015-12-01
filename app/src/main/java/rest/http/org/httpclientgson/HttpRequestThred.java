package rest.http.org.httpclientgson;

/**
 * Created by layonn on 28/10/15.
 */
public class HttpRequestThred {
        private void getJson(final String url){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    //Criando objeto de retorno que no caso pode ser categotias
                    Object retorno = null;
                    try{
                        //Setando o cliente http e o request, que será do tipo GET
                        HttpClient httpClient = new DefaultHttpClient();
                    }
                }
            })
        }
}
