
package ruchad.codepath.nytsearch.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class Headline {

    @SerializedName("main")
    @Expose
    private String main;

    /**
     * 
     * @return
     *     The main
     */
    public String getMain() {
        return main;
    }

    /**
     * 
     * @param main
     *     The main
     */
    public void setMain(String main) {
        this.main = main;
    }

}
