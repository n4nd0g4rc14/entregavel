function inteiros(arr) {
    let count = 0;
    for (let i = 0; i < arr.length; i++) {
      if (Number.isinteiros(arr[i])) {
        count++;
      }
    }
    return count;
  }

  const inteiros = inteiros(array);
  console.log("Existem" + inteiros + "números inteiros no array.");