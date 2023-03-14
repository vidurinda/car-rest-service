package com.ices.crs;

import com.ices.crs.factories.CarFactory;
import com.ices.crs.factories.SportCarFactory;
import com.ices.crs.model.Car;
import com.ices.crs.model.CartType;
import com.ices.crs.service.CarServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class CarRestServiceApplicationTests {

    @Mock
    private CarServiceImpl carService;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void get_Sport_Car_Service_Test() {
        Optional<Car> car = Optional.of(CarFactory.getCar(
                new SportCarFactory("sport", "RON100",
                        "Two Seater",
                        "Allow Sport",
                        "300Kmph")));

        Mockito.when(carService.getCarByType(CartType.SPORT)).thenReturn(car);
        carService.getCarByType(null);
        Assert.assertEquals("sport", car.get().carType());


    }

    @Test
    void get_TwoWheel_Car_Service_Test() {
        Optional<Car> car = Optional.of(CarFactory.getCar(
                new SportCarFactory("wheel2", "RON100",
                        "Two Seater",
                        "Allow Sport",
                        "300Kmph")));

        Mockito.when(carService.getCarByType(CartType.SPORT)).thenReturn(car);
        carService.getCarByType(null);
        Assert.assertEquals("wheel2", car.get().carType());


    }


    @Test
    void get_Electric_Car_Service_Test() {
        Optional<Car> car = Optional.of(CarFactory.getCar(
                new SportCarFactory("electric", "RON100",
                        "Two Seater",
                        "Allow Sport",
                        "300Kmph")));

        Mockito.when(carService.getCarByType(CartType.SPORT)).thenReturn(car);
        carService.getCarByType(null);
        Assert.assertEquals("electric", car.get().carType());


    }

}
