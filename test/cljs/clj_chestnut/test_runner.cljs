(ns clj-chestnut.test-runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [clj-chestnut.core-test]
   [clj-chestnut.common-test]))

(enable-console-print!)

(doo-tests 'clj-chestnut.core-test
           'clj-chestnut.common-test)
