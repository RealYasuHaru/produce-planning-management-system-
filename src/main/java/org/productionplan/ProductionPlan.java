package org.productionplan;

import javax.persistence.*;

@Entity
public class ProductionPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // 种植前准备
    private String soilTesting;
    private String seedSelection;
    private String fieldPreparation;

    // 播种
    @Column(nullable = false)
    private String sowingTime;
    @Column(nullable = false)
    private String sowingMethod;

    // 施肥
    @Column(nullable = false)
    private String baseFertilizer;
    @Column(nullable = false)
    private String topDressing;

    // 灌溉
    @Column(nullable = false)
    private String irrigationPlan;
    @Column(nullable = false)
    private String irrigationMethod;

    // 病虫害防治
    @Column(nullable = false)
    private String monitoring;
    @Column(nullable = false)
    private String controlMeasures;

    // 收获
    @Column(nullable = false)
    private String harvestTime;
    @Column(nullable = false)
    private String harvestMethod;

    // 后期管理
    @Column(nullable = false)
    private String fieldCleaning;
    @Column(nullable = false)
    private String soilImprovement;

    // 记录与评估
    @Column(nullable = false)
    private String productionRecords;
    @Column(nullable = false)
    private String effectivenessEvaluation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSoilTesting() {
        return soilTesting;
    }

    public void setSoilTesting(String soilTesting) {
        this.soilTesting = soilTesting;
    }

    public String getSeedSelection() {
        return seedSelection;
    }

    public void setSeedSelection(String seedSelection) {
        this.seedSelection = seedSelection;
    }

    public String getFieldPreparation() {
        return fieldPreparation;
    }

    public void setFieldPreparation(String fieldPreparation) {
        this.fieldPreparation = fieldPreparation;
    }

    public String getSowingTime() {
        return sowingTime;
    }

    public void setSowingTime(String sowingTime) {
        this.sowingTime = sowingTime;
    }

    public String getSowingMethod() {
        return sowingMethod;
    }

    public void setSowingMethod(String sowingMethod) {
        this.sowingMethod = sowingMethod;
    }

    public String getBaseFertilizer() {
        return baseFertilizer;
    }

    public void setBaseFertilizer(String baseFertilizer) {
        this.baseFertilizer = baseFertilizer;
    }

    public String getTopDressing() {
        return topDressing;
    }

    public void setTopDressing(String topDressing) {
        this.topDressing = topDressing;
    }

    public String getIrrigationPlan() {
        return irrigationPlan;
    }

    public void setIrrigationPlan(String irrigationPlan) {
        this.irrigationPlan = irrigationPlan;
    }

    public String getIrrigationMethod() {
        return irrigationMethod;
    }

    public void setIrrigationMethod(String irrigationMethod) {
        this.irrigationMethod = irrigationMethod;
    }

    public String getMonitoring() {
        return monitoring;
    }

    public void setMonitoring(String monitoring) {
        this.monitoring = monitoring;
    }

    public String getControlMeasures() {
        return controlMeasures;
    }

    public void setControlMeasures(String controlMeasures) {
        this.controlMeasures = controlMeasures;
    }

    public String getHarvestTime() {
        return harvestTime;
    }

    public void setHarvestTime(String harvestTime) {
        this.harvestTime = harvestTime;
    }

    public String getHarvestMethod() {
        return harvestMethod;
    }

    public void setHarvestMethod(String harvestMethod) {
        this.harvestMethod = harvestMethod;
    }

    public String getFieldCleaning() {
        return fieldCleaning;
    }

    public void setFieldCleaning(String fieldCleaning) {
        this.fieldCleaning = fieldCleaning;
    }

    public String getSoilImprovement() {
        return soilImprovement;
    }

    public void setSoilImprovement(String soilImprovement) {
        this.soilImprovement = soilImprovement;
    }

    public String getProductionRecords() {
        return productionRecords;
    }

    public void setProductionRecords(String productionRecords) {
        this.productionRecords = productionRecords;
    }

    public String getEffectivenessEvaluation() {
        return effectivenessEvaluation;
    }

    public void setEffectivenessEvaluation(String effectivenessEvaluation) {
        this.effectivenessEvaluation = effectivenessEvaluation;
    }
}
