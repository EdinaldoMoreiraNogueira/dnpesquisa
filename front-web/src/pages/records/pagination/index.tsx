import React from 'react';
import './style.css';

type Props = {
 totalPages?:number;
 goToPage: Function;
 activePages: number;
}

const Pagination = ({totalPages = 0, goToPage, activePages}: Props) => {

    const paginationItens = Array.from(Array(totalPages).keys());
    return (
    
        <div className="pagination-container">
            {paginationItens.map(item => (
                <button key={item}
                className={`pagination-item ${activePages === item ? 'active' : 'inactive'}`}
                onClick={() => goToPage(item)}
                
                >
                {item + 1}
            </button>
            ))}
          
        </div>
        
    );
}

export default Pagination;