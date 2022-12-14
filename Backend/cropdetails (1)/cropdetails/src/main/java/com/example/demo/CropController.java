package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/Crop")

@CrossOrigin(origins="http://localhost:3000")
public class CropController {

    @Autowired
    private CropService cropService;

    //Returns List Of All The crops
    @GetMapping("/all")
    public List<Crop> getCrops() {
        return cropService.getAllCrops();
    }

    //Returns the data of The Crop by using id
    @GetMapping("/{Id}")
    public Crop findById(@PathVariable String Id) {
        return cropService.findById(Id);
    }

    //Adds the Crop into the database
    @PostMapping("/add")
    public Crop addCrop(@RequestBody Crop s) {
        return cropService.AddCrop(s);
    }

    //Updates the Crop data
    @PutMapping("/update")
    public Crop updateCrop(@RequestBody Crop s) {
        return cropService.updateCrop(s);
    }

    @GetMapping("/farmercrop/{farmerid}")
    public List<Crop> getFarmer(@PathVariable String farmerid) {
        return cropService.getListByFarmer(farmerid);
    }

    //Deletes the Crop data by using id
    @DeleteMapping("/delete/{Id}")
    public String deleteCrop(@PathVariable String Id){
        return cropService.deleteById(Id);
    }
}