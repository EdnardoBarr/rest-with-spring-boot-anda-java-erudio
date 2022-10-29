package br.com.erudio.controllers;

import br.com.erudio.converters.NumberConverter;
import br.com.erudio.mathOperations.MathOperations;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {
    private final AtomicLong counter = new AtomicLong();
    private MathOperations operation = new MathOperations();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {

        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedOperationException("Please set a numeric value!");
        }
        return operation.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }
    @RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtraction(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {

        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedOperationException("Please set a numeric value!");
        }
        return operation.subtraction(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }
    @RequestMapping(value = "/multiply/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiply(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {

        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedOperationException("Please set a numeric value!");
        }
        return operation.multiply(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }
    @RequestMapping(value = "/divide/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double divide(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {

        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedOperationException("Please set a numeric value!");
        }
        return operation.divide(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }
    @RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mean(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {

        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedOperationException("Please set a numeric value!");
        }
        return operation.mean(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }
    @RequestMapping(value = "/squareRoot/{numberOne}", method = RequestMethod.GET)
    public Double squareRoot(
            @PathVariable(value = "numberOne") String numberOne
    ) throws Exception {

        if (!NumberConverter.isNumeric(numberOne) ){
            throw new UnsupportedOperationException("Please set a numeric value!");
        }
        return operation.squareRoot(NumberConverter.convertToDouble(numberOne));
    }


}
