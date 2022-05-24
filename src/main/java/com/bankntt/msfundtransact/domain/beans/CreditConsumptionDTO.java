package com.bankntt.msfundtransact.domain.beans;

import lombok.*;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreditConsumptionDTO {
    @NotBlank
    private String creditid;
    @NotNull
    @Digits(integer =20, fraction=6)
    private BigDecimal consumption;

}
