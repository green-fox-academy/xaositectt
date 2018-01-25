package com.example.firstproject.controllers;

import static com.example.firstproject.models.Jedi.sithSpeak;
import static com.example.firstproject.models.ToTranslate.translateFunny;

import com.example.firstproject.models.Appended;
import com.example.firstproject.models.ArrayHandlerDouble;
import com.example.firstproject.models.ArrayHandlerSumMultiply;
import com.example.firstproject.models.ArrayObject;
import com.example.firstproject.models.Doubling;
import com.example.firstproject.models.ErrorClass;
import com.example.firstproject.models.Factor;
import com.example.firstproject.models.Greeting;
import com.example.firstproject.models.Jedi;
import com.example.firstproject.models.Log;
import com.example.firstproject.models.Logs;
import com.example.firstproject.models.NewNumber;
import com.example.firstproject.models.NumberSum;
import com.example.firstproject.models.Sith;
import com.example.firstproject.models.ToTranslate;
import com.example.firstproject.models.Translated;
import com.example.firstproject.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController1 {

  @Autowired
  LogService logService;

  @GetMapping(value = "/doubling")
  public Object doubling(
      @RequestParam(value = "input", required = false) Integer number) {
    if (number == null) {
      return new ErrorClass("Please provide an input!");
    } else {
      String data = "input : " + number.toString();
      Log log = new Log("/doubling", data);
      logService.save(log);
      return new Doubling(number);
    }
  }

  @GetMapping(value = "/greeter")
  public Object greeter(@RequestParam(value = "name", required = false) String name,
      @RequestParam(value = "title", required = false) String title) {
    if (name == null) {
      return new ErrorClass("Please provide a name!");
    } else if (title == null) {
      return new ErrorClass("Please provide a title!");
    } else if (title == null && name == null) {
      return new ErrorClass("Please provide a name and title!");
    } else {
      String data = "name : " + name + ", title : " + title;
      Log log = new Log("/greeter", data);
      logService.save(log);
      return new Greeting(name, title);
    }
  }

  @GetMapping(value = "/appenda/{appendable}")
  public Object append(@PathVariable String appendable) {
    if (appendable == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    } else {
      String data = "Pathvariable :  " + appendable;
      Log log = new Log("/appenda/" + appendable, data);
      logService.save(log);
      return new Appended(appendable);
    }
  }

  @PostMapping(value = "/dountil/{what}")
  public Object doUntil(@RequestBody(required = false) NewNumber newnumber,
      @PathVariable(name = "what", required = false) String what) {
    if (newnumber == null) {
      return new ErrorClass("Please provide a number!");
    } else if (what.equals("sum")) {
      String data = "pathvariable : " + what + ", " + newnumber.toString();
      Log log = new Log("/dountil/" + what, data);
      logService.save(log);
      return new NumberSum(newnumber.getUntil());
    } else if (what.equals("factor")) {
      String data = "pathvariable : " + what + ", " + newnumber.toString();
      Log log = new Log("/dountil/" + what, data);
      logService.save(log);
      return new Factor(newnumber.getUntil());
    } else {
      return new ErrorClass("This is not a valid url");
    }
  }

  @PostMapping(value = "/arrays")
  public Object arrays(@RequestBody(required = false) ArrayObject arrayObject) {
    if (arrayObject == null) {
      return new ErrorClass("Please provide data!");
    } else if (arrayObject.getWhat() == null || arrayObject.getNumbers() == null) {
      return new ErrorClass("Please provide what to do with the numbers!");
    } else if (arrayObject.getWhat().equals("sum")) {
      saveArray(arrayObject, "sum");
      return new ArrayHandlerSumMultiply(arrayObject.sum());
    } else if (arrayObject.getWhat().equals("multiply")) {
      saveArray(arrayObject, "multiply");
      return new ArrayHandlerSumMultiply(arrayObject.multiply());
    } else if (arrayObject.getWhat().equals("double")) {
      saveArray(arrayObject, "double");
      return new ArrayHandlerDouble(arrayObject.doubleNumbers());
    } else {
      return "this is an invalid operation";
    }
  }

  @PostMapping(value = "/sith")
  public Object sith(@RequestBody(required = false) Jedi jedi) {
    if (jedi == null || jedi.getText().isEmpty()) {
      return new ErrorClass("Feed me some text you have to, padawan young you are. Hmmm.");
    } else {
      String sithText = sithSpeak(jedi.getText());
      Sith sith = new Sith(sithText);
      String data = "text : " + jedi.getText();
      Log log = new Log("/sith", data);
      logService.save(log);
      return sith;
    }
  }

  @PostMapping(value = "/translate")
  public Object translate(@RequestBody(required = false) ToTranslate toTranslate) {
    if (toTranslate == null || toTranslate.getText().isEmpty()) {
      return new ErrorClass("I can't translate that!");
    } else {
      String translatedText = translateFunny(toTranslate.getText(), "v");
      String data = "text : " + toTranslate.getText() + ", lang: " + toTranslate.getLang();
      Log log = new Log("/translate", data);
      logService.save(log);
      return new Translated(translatedText, "teve");
    }
  }

  @GetMapping(value = "/log")
  public Object showLog(@RequestParam(value = "count", required = false) Integer count,
      @RequestParam(value = "count", required = false) Integer page) {
    String data = "event: log call";
    Log log = new Log("/log", data);
    logService.save(log);
    Logs logs= new Logs(logService.findAll(), logService.numberOfLogs());
    return logs;
  }



  public void saveArray(ArrayObject arrayObject, String method) {
    String data = arrayObject.toString();
    Log log = new Log("/arrays/" + method, data);
    logService.save(log);
  }
}

