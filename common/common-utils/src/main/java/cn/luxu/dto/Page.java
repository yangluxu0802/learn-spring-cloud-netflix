package cn.luxu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 分页对象
 *
 * @param <T>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Page<T> implements Serializable {

    private static final long serialVersionUID = -275582248840137389L;
    private int total;
    private List<T> data;
}
