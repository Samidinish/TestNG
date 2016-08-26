package search;

import common.Base;
import org.testng.annotations.Test;

/**
 * Created by rrt on 8/21/2016.
 */
public class SearchContent extends Base {

    @Test
    public void searchNews(){
        clickByCss(".button.search-button");
        typeByCss("#search-input", "Olympic");
    }
}
