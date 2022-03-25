package com.ideas.miproyecto.springboot.app.meetups.util;

import com.ideas.miproyecto.springboot.app.meetups.model.entity.WeatherFinal;
import org.springframework.stereotype.Service;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

@Service
public class BeerMeetUp {
    private static DecimalFormat format = new DecimalFormat("#.#");
    //Faltan comentarios, de que hace cada metodo
    //Este tipo de archivos tambien se los puede denominar como clases Handler que son las clases que colaboran
    //con los controladores y que manejan logica... 
    public static double getMeetupBeer(Double weather, int meetAssists) {

        double beers = 0;

        if (Beer.LESSBEER.getMax() > weather) {
            beers = Beer.LESSBEER.getBeers();
        } else if (Beer.TWOBEERS.getMin() < weather) {
            beers = Beer.TWOBEERS.getBeers();
        } else if (Beer.BEER.getMin() < weather && Beer.BEER.getMax() > weather) {
            beers = Beer.BEER.getBeers();
        }
        double totalBeers = beers * meetAssists;
        Double totalBeersUp = format(totalBeers);
        double packBeers = format(Math.ceil(totalBeersUp / 6));
        return packBeers;

    }


    public static Double format(Number n) {
        NumberFormat format = DecimalFormat.getInstance();
        format.setRoundingMode(RoundingMode.UP);
        format.setMinimumFractionDigits(0);
        format.setMaximumFractionDigits(2);
        return Double.valueOf(format.format(n));
    }

    public static double getBeersNumber(Double weather) {

        double beers = 0;

        if (Beer.LESSBEER.getMax() > weather) {
            beers = Beer.LESSBEER.getBeers();
        } else if (Beer.TWOBEERS.getMin() < weather) {
            beers = Beer.TWOBEERS.getBeers();
        } else if (Beer.BEER.getMin() < weather && Beer.BEER.getMax() > weather) {
            beers = Beer.BEER.getBeers();
        }
        double totalBeers = beers;

        return totalBeers;

    }

    public static Double calculateBeerByPerson(List<WeatherFinal> weatherFinalList, Double meetUpWeather) {
        Double beer = 0.0;
        for (WeatherFinal weatherFinal : weatherFinalList) {
            if (weatherFinal.getMaximumTemperature() != null) {
                if (weatherFinal.getMinimunTemperature() == null && weatherFinal.getMaximumTemperature().compareTo(meetUpWeather) == 1) {
                    beer = weatherFinal.getAmountBeerByPerson();
                    break;
                }
            }
            if (weatherFinal.getMinimunTemperature() != null) {
                if (weatherFinal.getMaximumTemperature() == null && weatherFinal.getMinimunTemperature().compareTo(meetUpWeather) == -1) {
                    beer = weatherFinal.getAmountBeerByPerson();
                    break;
                }
            }
            if (weatherFinal.getMinimunTemperature() != null && weatherFinal.getMaximumTemperature() != null) {
                if (weatherFinal.getMinimunTemperature().compareTo(meetUpWeather) >= 0 && weatherFinal.getMaximumTemperature().compareTo(meetUpWeather) <= 0) {
                    beer = weatherFinal.getAmountBeerByPerson();
                    break;
                }
            }
        }
        Double value = beer;
        return BeerMeetUp.format(value);
    }

}
