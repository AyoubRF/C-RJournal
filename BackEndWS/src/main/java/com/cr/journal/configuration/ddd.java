case "TTD_ACC_SICK_52_7":
        switch (bestEstimateBenefits.getBenefitsPK().getClassification().getClassification()) {
        case 1:
        bestEstimateBenefits.setRate((bestEstimateBenefits.getRate() * (1 - (rateIdentifier.charAt(3) == 'y' ? -0.8 : rateIdentifier.substring(0, 2).equals("yy") || country.equals("Oman") ? 0.8 : rateBases.equals("Pilot Rates") ? 0.55 : 0))) / (1 - AEandCoC_EXPO));
        break;
        case 2:
        Double o1 = (repository.findRate("TTD_ACC_SICK_52_7", 1) * (1 - (rateIdentifier.charAt(3) == 'y' ? -0.8 : rateIdentifier.substring(0, 2).equals("yy") || country.equals("Oman") ? 0.8 : rateBases.equals("Pilot Rates") ? 0.55 : 0)));
        Double o2 = repository.findRate("MEDEX_ACC_AND_TDD", 2);
        Double o = rateIdentifier.charAt(3) == 'y' ? -0.8 : rateIdentifier.substring(0, 2).equals("yy") || country.equals("Oman") ? 0.78 : rateBases.equals("Pilot Rates") ? 0.55 : 0;
        bestEstimateBenefits.setRate((o == 0.78 ? o2 * o1 : bestEstimateBenefits.getRate() * (1 - o)) / (1 - AEandCoC_EXPO));
        break;
        case 3:
        Double o17 = (repository.findRate("TTD_ACC_SICK_52_7", 1) * (1 - (rateIdentifier.charAt(3) == 'y' ? -0.8 : rateIdentifier.substring(0, 2).equals("yy") || country.equals("Oman") ? 0.8 : rateBases.equals("Pilot Rates") ? 0.55 : 0)));
        Double o27 = repository.findRate("MEDEX_ACC_AND_TDD", 3);
        Double o7 = rateIdentifier.charAt(3) == 'y' ? -0.8 : rateIdentifier.substring(0, 2).equals("yy") || country.equals("Oman") ? 0.78 : rateBases.equals("Pilot Rates") ? 0.55 : 0;
        bestEstimateBenefits.setRate((o7 == 0.78 ? o27 * o17 : bestEstimateBenefits.getRate() * (1 - o7)) / (1 - AEandCoC_EXPO));
        break;
        }
        break;
        case "TTD_ACC_SICK_52_14":
        switch (bestEstimateBenefits.getBenefitsPK().getClassification().getClassification()) {
        case 1:
        bestEstimateBenefits.setRate((bestEstimateBenefits.getRate() * (1 - (rateIdentifier.charAt(3) == 'y' ? -0.8 : rateIdentifier.substring(0, 2).equals("yy") || country.equals("Oman") ? 0.8 : rateBases.equals("Pilot Rates") ? 0.55 : 0))) / (1 - AEandCoC_EXPO));
        break;
        case 2:
        Double o1 = (repository.findRate("TTD_ACC_SICK_52_14", 1) * (1 - (rateIdentifier.charAt(3) == 'y' ? -0.8 : rateIdentifier.substring(0, 2).equals("yy") || country.equals("Oman") ? 0.8 : rateBases.equals("Pilot Rates") ? 0.55 : 0)));
        Double o2 = repository.findRate("MEDEX_ACC_AND_TDD", 2);
        Double o = rateIdentifier.charAt(3) == 'y' ? -0.8 : rateIdentifier.substring(0, 2).equals("yy") || country.equals("Oman") ? 0.78 : rateBases.equals("Pilot Rates") ? 0.55 : 0;
        bestEstimateBenefits.setRate((o == 0.78 ? o2 * o1 : bestEstimateBenefits.getRate() * (1 - o)) / (1 - AEandCoC_EXPO));
        break;
        case 3:
        Double o17 = (repository.findRate("TTD_ACC_SICK_52_14", 1) * (1 - (rateIdentifier.charAt(3) == 'y' ? -0.8 : rateIdentifier.substring(0, 2).equals("yy") || country.equals("Oman") ? 0.8 : rateBases.equals("Pilot Rates") ? 0.55 : 0)));
        Double o27 = repository.findRate("MEDEX_ACC_AND_TDD", 3);
        Double o7 = rateIdentifier.charAt(3) == 'y' ? -0.8 : rateIdentifier.substring(0, 2).equals("yy") || country.equals("Oman") ? 0.78 : rateBases.equals("Pilot Rates") ? 0.55 : 0;
        bestEstimateBenefits.setRate((o7 == 0.78 ? o27 * o17 : bestEstimateBenefits.getRate() * (1 - o7)) / (1 - AEandCoC_EXPO));
        break;
        }
        break;
        case "TTD_ACC_SICK_104_7":
        switch (bestEstimateBenefits.getBenefitsPK().getClassification().getClassification()) {
        case 1:
        bestEstimateBenefits.setRate((bestEstimateBenefits.getRate() * (1 - (rateIdentifier.charAt(3) == 'y' ? -0.8 : rateIdentifier.substring(0, 2).equals("yy") || country.equals("Oman") ? 0.8 : rateBases.equals("Pilot Rates") ? 0.55 : 0))) / (1 - AEandCoC_EXPO));
        break;
        case 2:
        Double o1 = (repository.findRate("TTD_ACC_SICK_104_7", 1) * (1 - (rateIdentifier.charAt(3) == 'y' ? -0.8 : rateIdentifier.substring(0, 2).equals("yy") || country.equals("Oman") ? 0.8 : rateBases.equals("Pilot Rates") ? 0.55 : 0)));
        Double o2 = repository.findRate("MEDEX_ACC_AND_TDD", 2);
        Double o = rateIdentifier.charAt(3) == 'y' ? -0.8 : rateIdentifier.substring(0, 2).equals("yy") || country.equals("Oman") ? 0.78 : rateBases.equals("Pilot Rates") ? 0.55 : 0;
        bestEstimateBenefits.setRate((o == 0.78 ? o2 * o1 : bestEstimateBenefits.getRate() * (1 - o)) / (1 - AEandCoC_EXPO));
        break;
        case 3:
        Double o17 = (repository.findRate("TTD_ACC_SICK_104_7", 1) * (1 - (rateIdentifier.charAt(3) == 'y' ? -0.8 : rateIdentifier.substring(0, 2).equals("yy") || country.equals("Oman") ? 0.8 : rateBases.equals("Pilot Rates") ? 0.55 : 0)));
        Double o27 = repository.findRate("MEDEX_ACC_AND_TDD", 3);
        Double o7 = rateIdentifier.charAt(3) == 'y' ? -0.8 : rateIdentifier.substring(0, 2).equals("yy") || country.equals("Oman") ? 0.78 : rateBases.equals("Pilot Rates") ? 0.55 : 0;
        bestEstimateBenefits.setRate((o7 == 0.78 ? o27 * o17 : bestEstimateBenefits.getRate() * (1 - o7)) / (1 - AEandCoC_EXPO));
        break;
        }
        break;
        case "TTD_ACC_SICK_104_14":
        switch (bestEstimateBenefits.getBenefitsPK().getClassification().getClassification()) {
        case 1:
        bestEstimateBenefits.setRate((bestEstimateBenefits.getRate() * (1 - (rateIdentifier.charAt(3) == 'y' ? -0.8 : rateIdentifier.substring(0, 2).equals("yy") || country.equals("Oman") ? 0.8 : rateBases.equals("Pilot Rates") ? 0.55 : 0))) / (1 - AEandCoC_EXPO));
        break;
        case 2:
        Double o1 = (repository.findRate("TTD_ACC_SICK_104_14", 1) * (1 - (rateIdentifier.charAt(3) == 'y' ? -0.8 : rateIdentifier.substring(0, 2).equals("yy") || country.equals("Oman") ? 0.8 : rateBases.equals("Pilot Rates") ? 0.55 : 0)));
        Double o2 = repository.findRate("MEDEX_ACC_AND_TDD", 2);
        Double o = rateIdentifier.charAt(3) == 'y' ? -0.8 : rateIdentifier.substring(0, 2).equals("yy") || country.equals("Oman") ? 0.78 : rateBases.equals("Pilot Rates") ? 0.55 : 0;
        bestEstimateBenefits.setRate((o == 0.78 ? o2 * o1 : bestEstimateBenefits.getRate() * (1 - o)) / (1 - AEandCoC_EXPO));
        break;
        case 3:
        Double o17 = (repository.findRate("TTD_ACC_SICK_104_14", 1) * (1 - (rateIdentifier.charAt(3) == 'y' ? -0.8 : rateIdentifier.substring(0, 2).equals("yy") || country.equals("Oman") ? 0.8 : rateBases.equals("Pilot Rates") ? 0.55 : 0)));
        Double o27 = repository.findRate("MEDEX_ACC_AND_TDD", 3);
        Double o7 = rateIdentifier.charAt(3) == 'y' ? -0.8 : rateIdentifier.substring(0, 2).equals("yy") || country.equals("Oman") ? 0.78 : rateBases.equals("Pilot Rates") ? 0.55 : 0;
        bestEstimateBenefits.setRate((o7 == 0.78 ? o27 * o17 : bestEstimateBenefits.getRate() * (1 - o7)) / (1 - AEandCoC_EXPO));
        break;
        }
        break;
        case "TERMINAL_ILLNESS":
        bestEstimateBenefits.setRate(bestEstimateBenefits.getRate() * (1 - (rateIdentifier.charAt(3) == 'y' ? -0.8 : 0)));
        break;
        case "MEDEX":
        bestEstimateBenefits.setRate((bestEstimateBenefits.getRate() * (1 - (rateIdentifier.charAt(3) == 'y' ? -0.8 : 0))) / (1 - AEandCoC_EXPO));
        break;
        case "TERRORISM":
        bestEstimateBenefits.setRate((bestEstimateBenefits.getRate() * (1 - (rateIdentifier.charAt(3) == 'y' ? -0.8 : 0))) / (1 - AEandCoC_EXPO));
        break;
        case "WORKMEN_COMP":
        bestEstimateBenefits.setRate((bestEstimateBenefits.getRate() * (1 - (rateIdentifier.charAt(3) == 'y' ? -0.8 : 0))) / (1 - AEandCoC_EXPO));
        break;
        case "PW_W_PTD_COVER":
        case "PW_W_O_PTD_COVER":
        bestEstimateBenefits.setRate(bestEstimateBenefits.getRate() / (1 - AEandCoC_EXPO));
        break;
        }
        return bestEstimateBenefits;
        }
