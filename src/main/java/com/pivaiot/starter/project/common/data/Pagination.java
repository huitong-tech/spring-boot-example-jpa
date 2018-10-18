package com.pivaiot.starter.project.common.data;

import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 分页结构.
 *
 * @param <T> 分页数组中的数据项类型
 */
@Data
public class Pagination<T> implements BaseData {

    // 总记录数　
    private Long total;

    // 总页数
    private Integer pages;

    // 当前页
    private Integer page;

    // 页大小
    private Integer size;

    // 当前内容
    private List<T> rows;

    public Pagination(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public Pagination(Long total, Integer page, Integer size, List<T> rows) {
        this.total = total;
        this.pages = Math.toIntExact((total - 1) / size + 1);

        this.page = page;
        this.size = size;
        this.rows = rows;
    }

    public Pagination(Long total, Integer page, Integer size) {
        this(total, page, size, Lists.newArrayList());
    }

    public Pagination() {
        this(0L, 0, 20);
    }

    public <R> Pagination<R> map(Function<? super T, ? extends R> mapFunction) {
        Pagination<R> paginationMapped = new Pagination<>(this.total, this.page, this.size);
        paginationMapped.rows = this.rows.stream().map(mapFunction).collect(Collectors.toList());
        return paginationMapped;
    }

    public static <T> Pagination newPagination(Long totalCount, Integer page, Integer pageSize, List<T> list) {
        return new Pagination<>(totalCount, page, pageSize, list);
    }

    public static <T> Pagination<T> emptyPagination() {
        return new Pagination<>();
    }
}
