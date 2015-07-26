package hellomvcworld;

import org.jooby.Jooby;

public class App extends Jooby {

  {

    use(MyController.class);

  }

  public static void main(final String[] args) throws Exception {
    new App().start(args);
  }
}
