package org.productionplan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://127.0.0.1") // 允许前端的请求来源
public class ProductionPlanController {

    @Autowired
    private ProductionPlanRepository productionPlanRepository;

    // 获取所有生产计划
    @GetMapping("/api/plans")
    public ResponseEntity<List<ProductionPlan>> getAllPlans() {
        List<ProductionPlan> plans = productionPlanRepository.findAll();
        return ResponseEntity.ok().body(plans);
    }

    // 添加新生产计划
    @PostMapping("/api/add")
    public ResponseEntity<ProductionPlan> addPlan(@RequestBody ProductionPlan plan) {
        ProductionPlan newPlan = productionPlanRepository.save(plan);
        return ResponseEntity.status(HttpStatus.CREATED).body(newPlan);
    }

    // 根据ID获取单个计划
    @GetMapping("/api/plan/{id}")
    public ResponseEntity<ProductionPlan> getPlanById(@PathVariable Long id) {
        Optional<ProductionPlan> planOptional = productionPlanRepository.findById(id);
        return planOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // 更新生产计划
    @PutMapping("/api/update/{id}")
    public ResponseEntity<ProductionPlan> updatePlan(@PathVariable Long id, @RequestBody ProductionPlan updatedPlan) {
        Optional<ProductionPlan> planOptional = productionPlanRepository.findById(id);
        if (planOptional.isPresent()) {
            ProductionPlan existingPlan = planOptional.get();
            existingPlan.setSoilTesting(updatedPlan.getSoilTesting());
            existingPlan.setSeedSelection(updatedPlan.getSeedSelection());
            existingPlan.setFieldPreparation(updatedPlan.getFieldPreparation());
            existingPlan.setSowingTime(updatedPlan.getSowingTime());
            existingPlan.setSowingMethod(updatedPlan.getSowingMethod());
            existingPlan.setBaseFertilizer(updatedPlan.getBaseFertilizer());
            existingPlan.setTopDressing(updatedPlan.getTopDressing());
            existingPlan.setIrrigationPlan(updatedPlan.getIrrigationPlan());
            existingPlan.setIrrigationMethod(updatedPlan.getIrrigationMethod());
            existingPlan.setMonitoring(updatedPlan.getMonitoring());
            existingPlan.setControlMeasures(updatedPlan.getControlMeasures());
            existingPlan.setHarvestTime(updatedPlan.getHarvestTime());
            existingPlan.setHarvestMethod(updatedPlan.getHarvestMethod());
            existingPlan.setFieldCleaning(updatedPlan.getFieldCleaning());
            existingPlan.setSoilImprovement(updatedPlan.getSoilImprovement());
            existingPlan.setProductionRecords(updatedPlan.getProductionRecords());
            existingPlan.setEffectivenessEvaluation(updatedPlan.getEffectivenessEvaluation());
            ProductionPlan savedPlan = productionPlanRepository.save(existingPlan);
            return ResponseEntity.ok().body(savedPlan);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // 删除生产计划
    @DeleteMapping("/api/delete/{id}")
    public ResponseEntity<?> deletePlan(@PathVariable Long id) {
        Optional<ProductionPlan> planOptional = productionPlanRepository.findById(id);
        if (planOptional.isPresent()) {
            productionPlanRepository.delete(planOptional.get());
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
