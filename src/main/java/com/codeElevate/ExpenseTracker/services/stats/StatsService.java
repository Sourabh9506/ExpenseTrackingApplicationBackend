package com.codeElevate.ExpenseTracker.services.stats;

import com.codeElevate.ExpenseTracker.dto.GraphDTO;
import com.codeElevate.ExpenseTracker.dto.StatsDTO;

public interface StatsService {

    GraphDTO getChartData();

    StatsDTO getStats();
}
