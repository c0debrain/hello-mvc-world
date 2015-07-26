package hellomvcworld;

import java.util.Optional;

import org.jooby.mvc.GET;
import org.jooby.mvc.Path;

@Path("/")
public class MyController {

  @GET
  public String sayHi(final Optional<String> name) {
    return "Hello " + name.orElse("World") + "!";
  }

}
