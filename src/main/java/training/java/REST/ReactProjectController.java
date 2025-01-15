package training.java.REST;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ReactProjectController {
    private static final Logger logger = LoggerFactory.getLogger(ReactProjectController.class);

    @GetMapping("/reactnextjsproject/revenue")
    public ResponseEntity<List<RevenueDto>> getRevenue(
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "10") int pageSize){
        logger.info("RestController getRevenue route called. pageNumber " + pageNumber + " pageSize " + pageSize);

        var revenues = new ArrayList<RevenueDto>();
        revenues.add(new RevenueDto("Jan", "1000"));
        revenues.add(new RevenueDto("Fev", "6000"));
        revenues.add(new RevenueDto("Mar", "2300"));

        return ResponseEntity.ok(revenues);
    }
}
