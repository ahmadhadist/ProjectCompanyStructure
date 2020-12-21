package com.project.miniproject2;

public class Accountant extends BusinessEmployee{

    protected TechnicalLead teamSupported;

    public Accountant(){

    }

    public Accountant(String name){
        super(name);
        bonusBudget = 0;


    }

    public TechnicalLead getTeamSupported() {
        return teamSupported;
    }

    public void supportTeam(TechnicalLead lead){
        this.teamSupported = lead;
        for (int i = 0; i < lead.team.size(); i++){
            this.bonusBudget += lead.team.get(i).getBaseSalery()*1.1;
        }
    }

    public boolean approveBonus(double bonus){
        if (bonus<=bonusBudget){
            return true;
        } else {
            return false;
        }
    }

    public String employeeStatus(){
        return super.employeeStatus() + " is supporting " + this.getTeamSupported();
    }


}
